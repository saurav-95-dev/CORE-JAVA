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
->Available Service within a region
->Pricing

# AWS Availability Zones AZ:
->Each region has usually 3 availability zones - min-3 , max-6.
->Each AZ has one or more data centers with redundant power , networking and connectivity.
->They are separate from each other to facilitate disaster recovery.
->They are connected with high bandwidth , ultra low latency networking.

#AWS Point of presence (Edge Locations):
->AWS has 400+ Points of presence
->Main Essence - Content is delivered to users with lower latency.
----------------------------------------------------------------------------------------
### - INTRODUCTION TO AWS SERVICE-1- IAM (Identity and Access Management) AND AWS-CLI:
-> It is a global service.
-> Root Account created by default in aws should not be used or shared.
-> Users can be grouped together .
-> Groups can only contain users, not other groups.
-> Some users don't necessarily need to belong to a group .
-> Users can belong to a multiple group.

*/
