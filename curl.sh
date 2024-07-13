#!/bin/bash
// curl -X POST -H 'Content-type: application/json' --data '{"text":"Hello, World!"}' https://hooks.slack.com/services/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
curl -X POST -H 'Content-type: application/json' --data '${jsonPayload}' ${env.SLACK_WEBHOOK_URL}"
