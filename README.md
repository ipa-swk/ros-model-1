# Ros Model

#### Describe a ROS node using Sirius

1.Import into a new Eclipse workspace the projects:

```
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.sirius
```
2.Start a new eclipse application (de.fraunhofer.ipa.ros.sirius -> plugin.xml and click *Launch an Eclipse application*)

3.Create a new modeling project (menu File > New > Project > Sirius > Modeling Project)

4.Create a new ROS model to hold the description of your node (inside the modeling project New  > Other > Ros Model and choose as Model Object *Artifact*)

5.Create a new representation for your artifact (open the file representarions.aird with the aird editor, enable the representation *component*, select *Artifact* diagram" and click *New...*)

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view.

#### Create a ROS artifact project

1.Import into a new Eclipse workspace the projects:

```
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui
de.fraunhofer.ipa.rosartifact.xtext
de.fraunhofer.ipa.rosartifact.xtext.ide
de.fraunhofer.ipa.rosartifact.xtext.ui
```
2.Start a new eclipse application (de.fraunhofer.ipa.ros.editor -> plugin.xml and click *Launch an Eclipse application*)

3.Create a new ROS artifact project (menu File > New > Other > ROS Artifact project)

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view (if it is disabled go to *Window* > *Show view* > *Other* and choose *Properties*). 
