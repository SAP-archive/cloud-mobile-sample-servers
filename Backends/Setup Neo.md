# Setup Neo

This document will teach you how to setup your development environment, Cloud Foundry landscape and how to deploy and alter the used Java Backend.

* [Set up Neo for Mobile Services](#setupneo)
* [Clone the cloud-mobile-sample-servers repository](#clonerepo)
* [Deploy the Java Backend to Neo](#deployapp)

<a name="setupneo"/>

## Enable Mobile Services for Neo

Please complete the following tutorials in the [Set Up the SAP Cloud Platform SDK for iOS](https://developers.sap.com/group.ios-sdk-setup.html) group:

1. [Enable SAP Cloud Platform Mobile Services](https://developers.sap.com/tutorials/fiori-ios-hcpms-setup.html)
2. [Configure Mobile Services in iOS Assistant](https://developers.sap.com/tutorials/fiori-ios-scpms-configure-ms-assistant.html)

<a name="clonerepo"/>

## Clone the cloud-mobile-sample-servers repository
In order to get the sample backends you should clone the repository to your machine. Why cloning the repository instead of downloading it as ZIP? - If you clone the repository rather then just downloading it as ZIP gives you the advantage that you can pull future changes directly without re-downloading the repository as ZIP.

> If you don't have Git installed on your MacBook please follow the instructions on the official [Git Homepage](https://git-scm.com/book/en/v1/Getting-Started-Installing-Git).

After you succesfully cloned the repository please go in the directory and inspect the items in there.

You will find the following folders:

* Backends
* ...

<a name="deployapp"/>

## Deploy the Java Backend to Neo
The actual WAR files are available under the [Release](https://github.com/SAP-samples/cloud-mobile-sample-servers/releases) tab on GitHub. No we can go ahead an deploy a backend on the NEO landscape.

Please go back and login to your [SAP Cloud Platform](https://account.hanatrial.ondemand.com/) account. There please select **Neo** as your landscape.

![deploy-1](https://user-images.githubusercontent.com/9074514/58994032-16e4f200-87a4-11e9-92cc-0324d20874e5.png)

On the left hand side you will see **Applications** if you expand it now select **Java Applications**. You should see the following screen showing up.

![deploy-2](https://user-images.githubusercontent.com/9074514/58994033-177d8880-87a4-11e9-98d1-6c2f2e5fa46d.png)

Now click on **Deploy Application**. In the upcoming screen please brows for the WAR you want to deploy. Also select **Java Web Tomcat 8** as **Runtime Name**.

![deploy-3](https://user-images.githubusercontent.com/9074514/58994034-177d8880-87a4-11e9-9ee6-7f84228dea49.png)

Click on **Deploy**.

The following screen should show up where you have the option to start the Java Application the WAR was deployed succesfully.

![deploy-4](https://user-images.githubusercontent.com/9074514/58994035-177d8880-87a4-11e9-8a0a-b40ceaba7f20.png)

If the application was started successfully you should see something similiar like this.

![deploy-5](https://user-images.githubusercontent.com/9074514/58994036-177d8880-87a4-11e9-8897-c0cb3581d411.png)

Click now on the application name to see the **Application URLs**.

![deploy-6](https://user-images.githubusercontent.com/9074514/58994037-177d8880-87a4-11e9-8e26-3dd450b91a30.png)

To open the service in your browser click the shown URL. You should see the service document now.

![deploy-7](https://user-images.githubusercontent.com/9074514/58994038-177d8880-87a4-11e9-9269-10c56e613036.png)

In the url you can add **/$metadata** to see the metadata definition of the OData Service.

![deploy-8](https://user-images.githubusercontent.com/9074514/58994621-0766a880-87a6-11e9-94b0-6a4c8c633aa6.png)

You now have succesfully deployed your Java Backend application!
