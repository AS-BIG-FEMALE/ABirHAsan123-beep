curl -X POST 'https://api.github.com/graphql' -H 'Content-Type:application/json' -d '{
  "query": "query { \n viewer { \n login \n } \n}",
  "variables": {}
}'