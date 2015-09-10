/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.s.blestart;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
   // public static String HEART_RATE_MEASUREMENT = "00001800-0000-1000-8000-00805f9b34fb";
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        //////BLE standard
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access Service");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute Service");
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "immediate Alert");
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        attributes.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose service");
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        attributes.put("0000180A-0000-1000-8000-00805f9b34fb", "Device Information");
        attributes.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
        attributes.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure ");
        attributes.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service ");
        attributes.put("0000180F-0000-1000-8000-00805f9b34fb", "Battery Service");

        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        //////BLE standard
        attributes.put("00002a7e-0000-1000-8000-00805f9b34fb",  "Aerobic Heart ");
        attributes.put("00002a84-0000-1000-8000-00805f9b34fb",  "Aerobic Heart ");
        attributes.put("00002a7f-0000-1000-8000-00805f9b34fb",  "Aerobic Threshold ");
        attributes.put("00002a80-0000-1000-8000-00805f9b34fb",  "Age ");
        attributes.put("00002a5a-0000-1000-8000-00805f9b34fb",  "Aggregate ");
        attributes.put("00002a43-0000-1000-8000-00805f9b34fb",  "Alert Category ");
        attributes.put("00002a42-0000-1000-8000-00805f9b34fb",  "Alert Category ");
        attributes.put("00002a06-0000-1000-8000-00805f9b34fb",  "Alert Level ");
        attributes.put("00002a44-0000-1000-8000-00805f9b34fb",  "Alert Notification ");
        attributes.put("00002a3f-0000-1000-8000-00805f9b34fb",  "Alert Status ");
        attributes.put("00002ab3-0000-1000-8000-00805f9b34fb",  "Altitude ");
        attributes.put("00002a81-0000-1000-8000-00805f9b34fb",  "Anaerobic Heart ");
        attributes.put("00002a82-0000-1000-8000-00805f9b34fb",  "Anaerobic Heart ");
        attributes.put("00002a83-0000-1000-8000-00805f9b34fb",  "Anaerobic Threshold ");
        attributes.put("00002a58-0000-1000-8000-00805f9b34fb",  "Analog ");
        attributes.put("00002a73-0000-1000-8000-00805f9b34fb",  "Apparent Wind ");
        attributes.put("00002a72-0000-1000-8000-00805f9b34fb",  "Apparent Wind ");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb",  "Appearance ");
        attributes.put("00002aa3-0000-1000-8000-00805f9b34fb",  "Barometric Pressure ");
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb",  "Battery Level ");
        attributes.put("00002a49-0000-1000-8000-00805f9b34fb",  "Blood Pressure ");
        attributes.put("00002a35-0000-1000-8000-00805f9b34fb",  "Blood Pressure ");
        attributes.put("00002a9b-0000-1000-8000-00805f9b34fb",  "Body Composition ");
        attributes.put("00002a9c-0000-1000-8000-00805f9b34fb",  "Body Composition ");
        attributes.put("00002a38-0000-1000-8000-00805f9b34fb",  "Body Sensor ");
        attributes.put("00002aa4-0000-1000-8000-00805f9b34fb",  "Bond Management ");
        attributes.put("00002aa5-0000-1000-8000-00805f9b34fb",  "Bond Management ");
        attributes.put("00002a22-0000-1000-8000-00805f9b34fb",  "Boot Keyboard ");
        attributes.put("00002a32-0000-1000-8000-00805f9b34fb",  "Boot Keyboard ");
        attributes.put("00002a33-0000-1000-8000-00805f9b34fb",  "Boot Mouse ");
        attributes.put("00002aa6-0000-1000-8000-00805f9b34fb",  "Central Address ");
        attributes.put("00002aa8-0000-1000-8000-00805f9b34fb",  "CGM Feature ");
        attributes.put("00002aa7-0000-1000-8000-00805f9b34fb",  "CGM Measurement ");
        attributes.put("00002aab-0000-1000-8000-00805f9b34fb",  "CGM Session ");
        attributes.put("00002aaa-0000-1000-8000-00805f9b34fb",  "CGM Session ");
        attributes.put("00002aac-0000-1000-8000-00805f9b34fb",  "CGM Specific ");
        attributes.put("00002aa9-0000-1000-8000-00805f9b34fb",  "CGM Status ");
        attributes.put("00002a5c-0000-1000-8000-00805f9b34fb",  "CSC Feature ");
        attributes.put("00002a5b-0000-1000-8000-00805f9b34fb",  "CSC Measurement ");
        attributes.put("00002a2b-0000-1000-8000-00805f9b34fb",  "Current Time ");
        attributes.put("00002a66-0000-1000-8000-00805f9b34fb",  "Cycling Power ");
        attributes.put("00002a65-0000-1000-8000-00805f9b34fb",  "Cycling Power ");
        attributes.put("00002a63-0000-1000-8000-00805f9b34fb",  "Cycling Power ");
        attributes.put("00002a64-0000-1000-8000-00805f9b34fb",  "Cycling Power ");
        attributes.put("00002a99-0000-1000-8000-00805f9b34fb",  "Database Change ");
        attributes.put("00002a85-0000-1000-8000-00805f9b34fb",  "Date of ");
        attributes.put("00002a86-0000-1000-8000-00805f9b34fb",  "Date of ");
        attributes.put("00002a08-0000-1000-8000-00805f9b34fb",  "Date Time ");
        attributes.put("00002a0a-0000-1000-8000-00805f9b34fb",  "Day Date ");
        attributes.put("00002a09-0000-1000-8000-00805f9b34fb",  "Day of ");
        attributes.put("00002a7d-0000-1000-8000-00805f9b34fb",  "Descriptor Value ");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb",  "Device Name ");
        attributes.put("00002a7b-0000-1000-8000-00805f9b34fb",  "Dew Point ");
        attributes.put("00002a56-0000-1000-8000-00805f9b34fb",  "Digital ");
        attributes.put("00002a0d-0000-1000-8000-00805f9b34fb",  "DST Offset ");
        attributes.put("00002a6c-0000-1000-8000-00805f9b34fb",  "Elevation ");
        attributes.put("00002a87-0000-1000-8000-00805f9b34fb",  "Email Address ");
        attributes.put("00002a0c-0000-1000-8000-00805f9b34fb",  "Exact Time ");
        attributes.put("00002a88-0000-1000-8000-00805f9b34fb",  "Fat Burn ");
        attributes.put("00002a89-0000-1000-8000-00805f9b34fb",  "Fat Burn ");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb",  "Firmware Revision ");
        attributes.put("00002a8a-0000-1000-8000-00805f9b34fb",  "First Name ");
        attributes.put("00002a8b-0000-1000-8000-00805f9b34fb",  "Five Zone ");
        attributes.put("00002ab2-0000-1000-8000-00805f9b34fb",  "Floor Number ");
        attributes.put("00002a8c-0000-1000-8000-00805f9b34fb",  "Gender ");
        attributes.put("00002a51-0000-1000-8000-00805f9b34fb",  "Glucose Feature ");
        attributes.put("00002a18-0000-1000-8000-00805f9b34fb",  "Glucose Measurement ");
        attributes.put("00002a34-0000-1000-8000-00805f9b34fb",  "Glucose Measurement ");
        attributes.put("00002a74-0000-1000-8000-00805f9b34fb",  "Gust Factor ");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb",  "Hardware Revision ");
        attributes.put("00002a39-0000-1000-8000-00805f9b34fb",  "Heart Rate ");
        attributes.put("00002a8d-0000-1000-8000-00805f9b34fb",  "Heart Rate ");
        attributes.put("00002a37-0000-1000-8000-00805f9b34fb",  "Heart Rate ");
        attributes.put("00002a7a-0000-1000-8000-00805f9b34fb",  "Heat Index ");
        attributes.put("00002a8e-0000-1000-8000-00805f9b34fb",  "Height ");
        attributes.put("00002a4c-0000-1000-8000-00805f9b34fb",  "HID Control ");
        attributes.put("00002a4a-0000-1000-8000-00805f9b34fb",  "HID Information ");
        attributes.put("00002a8f-0000-1000-8000-00805f9b34fb",  "Hip Circumference ");
        attributes.put("00002a6f-0000-1000-8000-00805f9b34fb",  "Humidity ");
        attributes.put("00002a2a-0000-1000-8000-00805f9b34fb",  "IEEE 11073-20601 ");
        attributes.put("00002aad-0000-1000-8000-00805f9b34fb",  "Indoor Positioning ");
        attributes.put("00002a36-0000-1000-8000-00805f9b34fb",  "Intermediate Cuff ");
        attributes.put("00002a1e-0000-1000-8000-00805f9b34fb",  "Intermediate Temperature ");
        attributes.put("00002a77-0000-1000-8000-00805f9b34fb",  "Irradiance ");
        attributes.put("00002aa2-0000-1000-8000-00805f9b34fb",  "Language ");
        attributes.put("00002a90-0000-1000-8000-00805f9b34fb",  "Last Name ");
        attributes.put("00002aae-0000-1000-8000-00805f9b34fb",  "Latitude ");
        attributes.put("00002a6b-0000-1000-8000-00805f9b34fb",  "LN Control ");
        attributes.put("00002a6a-0000-1000-8000-00805f9b34fb",  "LN Feature ");
        attributes.put("00002ab1-0000-1000-8000-00805f9b34fb",  "Local East ");
        attributes.put("00002ab0-0000-1000-8000-00805f9b34fb",  "Local North ");
        attributes.put("00002a0f-0000-1000-8000-00805f9b34fb",  "Local Time ");
        attributes.put("00002a67-0000-1000-8000-00805f9b34fb",  "Location and ");
        attributes.put("00002ab5-0000-1000-8000-00805f9b34fb",  "Location Name ");
        attributes.put("00002aaf-0000-1000-8000-00805f9b34fb",  "Longitude ");
        attributes.put("00002a2c-0000-1000-8000-00805f9b34fb",  "Magnetic Declination ");
        attributes.put("00002aa0-0000-1000-8000-00805f9b34fb",  "Magnetic Flux ");
        attributes.put("00002aa1-0000-1000-8000-00805f9b34fb",  "Magnetic Flux ");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb",  "Manufacturer Name ");
        attributes.put("00002a91-0000-1000-8000-00805f9b34fb",  "Maximum Recommended ");
        attributes.put("00002a21-0000-1000-8000-00805f9b34fb",  "Measurement Interval ");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb",  "Model Number ");
        attributes.put("00002a68-0000-1000-8000-00805f9b34fb",  "Navigation ");
        attributes.put("00002a46-0000-1000-8000-00805f9b34fb",  "New Alert ");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb",  "Peripheral Preferred ");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb",  "Peripheral Privacy ");
        attributes.put("00002a5f-0000-1000-8000-00805f9b34fb",  "PLX Continuous ");
        attributes.put("00002a60-0000-1000-8000-00805f9b34fb",  "PLX Features ");
        attributes.put("00002a5e-0000-1000-8000-00805f9b34fb",  "PLX Spot-Check ");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb",  "PnP ID ");
        attributes.put("00002a75-0000-1000-8000-00805f9b34fb",  "Pollen Concentration ");
        attributes.put("00002a69-0000-1000-8000-00805f9b34fb",  "Position Quality ");
        attributes.put("00002a6d-0000-1000-8000-00805f9b34fb",  "Pressure ");
        attributes.put("00002a4e-0000-1000-8000-00805f9b34fb",  "Protocol Mode ");
        attributes.put("00002a78-0000-1000-8000-00805f9b34fb",  "Rainfall ");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb",  "Reconnection Address ");
        attributes.put("00002a52-0000-1000-8000-00805f9b34fb",  "Record Access ");
        attributes.put("00002a14-0000-1000-8000-00805f9b34fb",  "Reference Time ");
        attributes.put("00002a4d-0000-1000-8000-00805f9b34fb",  "Report ");
        attributes.put("00002a4b-0000-1000-8000-00805f9b34fb",  "Report Map ");
        attributes.put("00002a92-0000-1000-8000-00805f9b34fb",  "Resting Heart ");
        attributes.put("00002a40-0000-1000-8000-00805f9b34fb",  "Ringer Control ");
        attributes.put("00002a41-0000-1000-8000-00805f9b34fb",  "Ringer Setting ");
        attributes.put("00002a54-0000-1000-8000-00805f9b34fb",  "RSC Feature ");
        attributes.put("00002a53-0000-1000-8000-00805f9b34fb",  "RSC Measurement ");
        attributes.put("00002a55-0000-1000-8000-00805f9b34fb",  "SC Control ");
        attributes.put("00002a4f-0000-1000-8000-00805f9b34fb",  "Scan Interval ");
        attributes.put("00002a31-0000-1000-8000-00805f9b34fb",  "Scan Refresh ");
        attributes.put("00002a5d-0000-1000-8000-00805f9b34fb",  "Sensor Location ");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb",  "Serial Number ");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb",  "Service Changed ");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb",  "Software Revision ");
        attributes.put("00002a93-0000-1000-8000-00805f9b34fb",  "Sport Type ");
        attributes.put("00002a47-0000-1000-8000-00805f9b34fb",  "Supported New ");
        attributes.put("00002a48-0000-1000-8000-00805f9b34fb",  "Supported Unread ");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb",  "System ID ");
        attributes.put("00002a6e-0000-1000-8000-00805f9b34fb",  "Temperature ");
        attributes.put("00002a1c-0000-1000-8000-00805f9b34fb",  "Temperature Measurement ");
        attributes.put("00002a1d-0000-1000-8000-00805f9b34fb",  "Temperature Type ");
        attributes.put("00002a94-0000-1000-8000-00805f9b34fb",  "Three Zone ");
        attributes.put("00002a12-0000-1000-8000-00805f9b34fb",  "Time Accuracy ");
        attributes.put("00002a13-0000-1000-8000-00805f9b34fb",  "Time Source ");
        attributes.put("00002a16-0000-1000-8000-00805f9b34fb",  "Time Update ");
        attributes.put("00002a17-0000-1000-8000-00805f9b34fb",  "Time Update ");
        attributes.put("00002a11-0000-1000-8000-00805f9b34fb",  "Time with ");
        attributes.put("00002a0e-0000-1000-8000-00805f9b34fb",  "Time Zone ");
        attributes.put("00002a71-0000-1000-8000-00805f9b34fb",  "True Wind ");
        attributes.put("00002a70-0000-1000-8000-00805f9b34fb",  "True Wind ");
        attributes.put("00002a95-0000-1000-8000-00805f9b34fb",  "Two Zone ");
        attributes.put("00002a07-0000-1000-8000-00805f9b34fb",  "Tx Power ");
        attributes.put("00002ab4-0000-1000-8000-00805f9b34fb",  "Uncertainty ");
        attributes.put("00002a45-0000-1000-8000-00805f9b34fb",  "Unread Alert ");
        attributes.put("00002a9f-0000-1000-8000-00805f9b34fb",  "User Control ");
        attributes.put("00002a9a-0000-1000-8000-00805f9b34fb",  "User Index ");
        attributes.put("00002a76-0000-1000-8000-00805f9b34fb",  "UV Index ");
        attributes.put("00002a96-0000-1000-8000-00805f9b34fb",  "VO2 Max ");
        attributes.put("00002a97-0000-1000-8000-00805f9b34fb",  "Waist Circumference ");
        attributes.put("00002a98-0000-1000-8000-00805f9b34fb",  "Weight ");
        attributes.put("00002a9d-0000-1000-8000-00805f9b34fb",  "Weight Measurement ");
        attributes.put("00002a9e-0000-1000-8000-00805f9b34fb",  "Weight Scale ");
        attributes.put("00002a79-0000-1000-8000-00805f9b34fb",  "Wind Chill ");




    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
