# ros-model
<a id="top"/> 

This repository holds the models and eclipse plugins to start MDE tools to describe ROS nodes and its interfaces.

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

## Contents

1. <a href="#1--installation-requirements">Installation Requirements</a>
2. <a href="#2--start">Start the software</a>


## 1. Installation and setup Requirements: <a id="1--installation-requirements"/> 

#### Eclipse installation
Download the official (Eclipse Installer)[https://www.eclipse.org/downloads/packages/installer] and choose the *Eclipse Modeling tools* package.

Once Eclipse is installed go to the menu *Help* and open the *Eclipse Marketplace* to install the pakcages:
```
Sirius
Eclipse Xtext
Eclipse Xtend
```

#### Setup the work environment
1. Clone the repository:

```
git clone https://github.com/seronet-project/ros-model
```
1. Import into a new Eclipse workspace the projects:

File -> Import -> General -> Existing projects into Workspace

Choose the folder where the repository was cloned and select the following projects:

```
de.fraunhofer.ipa.componentInterface
de.fraunhofer.ipa.componentInterface.edit
de.fraunhofer.ipa.componentInterface.editor
de.fraunhofer.ipa.componentInterface.xtext
de.fraunhofer.ipa.componentInterface.xtext.ide
de.fraunhofer.ipa.componentInterface.xtext.ui
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui

```

## 2. Start the software: <a id="2--start"/> 

 Start a new eclipse application by either (de.fraunhofer.ipa.ros.sirius -> plugin.xml and click *Launch an Eclipse application*) or (*right click* de.fraunhofer.ipa.ros.sirius and *click* on Run As > Eclipse Application)

#### Create a ROS artifact project 

1. Import the common communication objects project to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
3. Create a new ROS model project (menu File > New > Other > ROS Model project)

4. Once the project is created, open the *representations.aird* file and add a new representation for your Ros artifact

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view (if it is disabled go to *Window* > *Show view* > *Other* and choose *Properties*). 

#### Create a Component Interface for your ROS Model

1. Create a new ComponentInterface model (menu File > New > Other > ComponentInterface Model)

2. Open the model with the ComponentInterface Model Editor

3. Add your ros model as resource for the ComponentInterface ( *right click* and *click* on "Load resource.." and select the path of your model)

4. Use the *Properties* view to configure the component

<a href="#top">top</a>
