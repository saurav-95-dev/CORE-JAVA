//ALL About AWS : PHASE-1:
//----------------------------------------------------------------------------
/*
# Some Common use-cases - Enterprise IT, Backup & Storage, Big Data Analytics.
-> Web hosting, Mobile, Social Apps.
-> Gaming servers running on cloud.
----------------------------------------------------------------------------------
### - AWS GLOBAL INFRASTRUCTURE OVERVIEW :
# AWS Regions:
->AWS-Regions are basically a clusters of data centers.

->Most AWS-Services are region-scoped
->How to choose an AWS Regions if someone's plan to launch his application ?

# Factors affecting choice of selecting regions :
->Compliance with data governance and legal requirements
->Proximity to customers -- Reduced Latency.
->Available Service within a .
->Pricing

# AWS Availability Zones AZ:
->Each region has usually 3 availability zones - min-3 , max-6.
->Each AZ has one or more data centers with redundant power , networking and connectivity.
->These AZ are separate from each other to facilitate disaster recovery.
->They are connected with high bandwidth , ultra low latency networking.

#AWS Point of presence (Edge Locations):
->AWS has 400+ Points of presence in 90+ cities in across 40+ countries.
->Main Essence - Content is delivered to users with lower latency.

#QUICK AWS CONSOLE TOUR:
->AWS has global service : IAM(identity and access management),
Route 53(DNS Service),
CloudFront(Content Delivery Network),
WAF(Web Application Firewall).
->Most AWS Service are Region-scoped:
Amazon EC2(Infrastructure as a service),
Elastic Beanstalk(Platform as a service),
Lambda(Function as a  Service),
Rekognition(Software as a service).
---------------------------------------------------------------------------------------------------
### IAM AND AWS CLI :
->IAM - Identity and Access Management, Global Service.
->Group in IAM can contain users and not other groups.
->Users don't necessarily need  to belong to a group.
->A user can belong to a multiple group.
->We create users and groups to give them permission to use AWS service called IAM permission.
->Users and Groups can be assigned JSON documents called policies.
->This JSON Policy define permissions for the users.
->In AWS we apply least privilege principal:Don't give more permission than a user needs.
->When you create a user in IAM , it will be available everywhere as it is global.
 */


