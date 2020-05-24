# service-down-notifer

2 services:
1. Dead service
2. Service -down notifier

The Dead service represents the service which will be consumed by the other services.(hence has a controller that gives the health check status)
The Service Down service is the one which consumes the API's from the dead service and cannot afford the service to go down, and hence there is a scheduled taskwith a fixed rate.
This scheduled task constantly checks the other service and sends a notification to the developer's team(dead service) when the service goes down.
