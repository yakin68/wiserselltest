pipeline {
    agent any

    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::dev2.wisersell.com'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
        SLACK_WEBHOOK_TOKEN = credentials('SLACK_WEBHOOK_TOKEN')
        SLACK_CREDENTIAL_ID = 'slack-bot-token-son'
    }

    tools {
        maven 'maven'
    }

    stages {
        stage ('echo test') {
            steps {
                script { 
                    sh '''echo "yakin stage test" '''                    
                       }
            }
        }
        
        stage('Notify Slack') {
            steps {
                script {
                    def attachments = [
                      [
                        text: 'I find your lack of faith disturbing!',
                        fallback: 'Hey, Vader seems to be mad at you.',
                        color: '#ff0000'
                      ]
                    ]

                    blocks = [
                    	[
                    		"type": "section",
                    		"text": [
                    			"type": "mrkdwn",
                    			"text": "Hello, Assistant to the Regional Manager Dwight! *Michael Scott* wants to know where you'd like to take the Paper Company investors to dinner tonight.\n\n *Please select a restaurant:*"
                    		]
                    	],
                        [
                    		"type": "divider"
                    	],
                        [
                			"type": "section",
                			"text": [
                				"type": "mrkdwn",
                				"text": "Why not join <#C07CG6A2R8R|devops>?"
                			]
                		],                        
                    	[
                    		"type": "section",
                    		"text": [
                    			"type": "mrkdwn",
                    			"text": "*Farmhouse Thai Cuisine*\n:star::star::star::star: 1528 reviews\n They do have some vegan options, like the roti and curry, plus they have a ton of salad stuff and noodles can be ordered without meat!! They have something for everyone here"
                    		],
                    		"accessory": [
                    			"type": "image",
                    			"image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/c7ed05m9lC2EmA3Aruue7A/o.jpg",
                    			"alt_text": "alt text for image"
                    		]
                    	]
                    ]
                    
                    slackSend(channel: "#devops", blocks: blocks, attachments: attachments )
                                        
                }
            }
        }

        stage('Send the notification to Slack via curl') {
            steps {
                script {
                    def status = currentBuild.currentResult
                    def branchName = env.GIT_BRANCH.replaceAll('origin/', '')
                    sh "chmod +x ./curl.sh"
                    sh """
                    status=${status} branchName=${branchName} ./curl.sh
                    """
                }
            }
        }
    }
 post {
        always {
            script {
                def status = currentBuild.currentResult
                def blocks = [
                    [
                        "type": "section",
                        "text": [
                            "type": "mrkdwn",
                            "text": "*Pipeline* finished with status: ${status}\n${stagesInfo}}"
                        ]
                    ]
                ]
                slackSend(channel: "#devops", blocks: blocks)
            }
        }
        success {
            script {
                def blocks = [
                    [
                        "type": "section",
                        "text": [
                            "type": "mrkdwn",
                            "text": "*Pipeline* succeeded."
                        ]
                    ]
                ]
                slackSend(channel: "#devops", blocks: blocks)
            }
        }
        failure {
            script {
                def blocks = [
                    [
                        "type": "section",
                        "text": [
                            "type": "mrkdwn",
                            "text": "*Pipeline* failed.${status}\n${stagesInfo}}"
                        ]
                    ]
                ]
                slackSend(channel: "#devops", blocks: blocks)
            }
        }
    }
}
