pipeline {
    agent {
        kubernetes {
            yaml """
            apiVersion: v1
            kind: Pod
            spec:
              containers:
              - name: jnlp
                image: jenkins/inbound-agent:latest
                args: ['\$(JENKINS_SECRET)', '\$(JENKINS_NAME)']
              - name: awscli
                image: amazon/aws-cli
                command:
                - cat
                tty: true
            """
        }
    environment {
        AWS_KEY_ID = credentials('AWS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        AWS_BUCKET = 'arn:aws:s3:::yuceltest'
        SLACK_WEBHOOK_URL = 'https://hooks.slack.com/services/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'
        SLACK_WEBHOOK_TOKEN = credentials('SLACK_WEBHOOK_TOKEN')
        SLACK_CREDENTIAL_ID = 'slack-bot-token-son'
    }

    tools {
        maven 'maven'
    }

    stages {
                
        stage('Get Git User') {
            steps {
                script {

                    // Fetch branch name from Git SCM
                    def scmVars = checkout scm
                    def branchName = scmVars.GIT_BRANCH ?: sh(script: 'git rev-parse --abbrev-ref HEAD', returnStdout: true).trim()
                    echo "Current branch: ${branchName}"
                    
                    def gitUser = sh(script: "git log -1 --pretty=format:'%an'", returnStdout: true).trim()
                    def commitDate = sh(script: "git log -1 --pretty=format:'%cd'", returnStdout: true).trim()
                    def repoName = sh(script: "basename `git rev-parse --show-toplevel`", returnStdout: true).trim()

                    env.GIT_USER = gitUser ?: 'Unknown User'
                    env.COMMIT_DATE = commitDate ?: 'Unknown Date'
                    env.GIT_REPO_NAME = repoName ?: 'Unknown Repo' 
                }
            }
        }

        stage('List S3 Bucket Contents') {
            steps {
                script {
                    try {
                        sh '''
                            aws s3 ls
                        '''
                        env.STAGE_RESULTS += "Stage: :white_check_mark: List S3 Bucket Contents - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: List S3 Bucket Contents - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }    
        stage('echo test') {
            steps {
                script {
                    try {
                        sh '''echo "yakin stage test" '''
                        env.STAGE_RESULTS += "Stage: :white_check_mark: echo test - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: echo test - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }
        
        stage('Send the notification to Slack via curl') {
            steps {
                script {
                    try {
                        env.STAGE_RESULTS += "Stage: :white_check_mark: Send the notification to Slack via curl - SUCCESS \n"  // Success emoji
                    } catch (Exception e) {
                        env.STAGE_RESULTS += "Stage: :x: Send the notification to Slack via curl - FAILURE \n"    // Failure emoji
                        throw e
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                sendSlackNotification(env.STAGE_RESULTS)
            }
        }
    }
}

def sendSlackNotification(stageResults) {
    def status = currentBuild.currentResult
    def gitUser = env.GIT_USER ?: 'Unknown User'
    def commitDate = env.COMMIT_DATE ?: 'Unknown Date'
    def repoName = env.GIT_REPO_NAME ?: 'Unknown Repo'
    def repoNameUpper = repoName.toUpperCase()
    def branchName = env.GIT_BRANCH // GitHub branch adını al
    def reportUrl = "https://dev2.wisersell.com.s3.us-east-1.amazonaws.com/${env.STEP_S3_OUTPUT_OBJECT_KEY}/html-reports/Run_Smoke_Test.html"
    def blocks = [
        [
            "type": "section",
            "text": [
                "type": "mrkdwn",
                "text": "*Branc Name:* ${branchName}  \n*Repository:* > *_${repoNameUpper}_*       *Commit Date:* ${commitDate}\n *Job Status:* ${status}    *Actor:* ${gitUser}    *Branch:* ${branchName}\n *Report URL:* <${reportUrl}|Run Smoke Test>\n *Job Steps:*\n${env.STAGE_RESULTS}"
            ]
        ]
    ]
    slackSend(channel: "#devops", blocks: blocks)
}
