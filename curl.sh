#!/bin/bash

# Define the JSON payload
jsonPayload=$(cat <<EOF
{
    "status": "${status}",
    "steps": [],
    "channel": "devops",
    "config": "$(cat .github/config/slack-main.yaml)",
    "text": "Testing ${branchName} branch for VERSION-2 AUTOMATION TESTS-NEWW"
}
EOF
)

# Send the notification to Slack
curl -X POST -H 'Content-type: application/json' --data "$jsonPayload" "${SLACK_WEBHOOK_URL}"
