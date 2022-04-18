﻿# Google_Calculator_App_Automation
## Pre-requisites
* Install Android Studio latest version
* Install Appium server
* Install jdk
* Configure environment variable ANDROID_HOME, JAVA_HOME & GRADLE_HOME

## How to run this project
* Turn on Developer Options of your android phone
* Connect phone with pc
* Open cmd and give ```adb devices``` command to get uuid number of your phone
* Open Appium and start server. Then open inspector tools
* Set the desired capabilities and save it
* Select the saved desired capablities from 'Saved capability Sets' tab and click on start server.
* Clone the project
* Open terminal from the directory
* Run ```gradle clean test```

## Attachment
Desired capabilities
```
{
  "deviceName": "My Device",
  "uuid": Enter your uuid here,
  "platformName": "Android",
  "platformVersion": Enter your android version,
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
}
```
