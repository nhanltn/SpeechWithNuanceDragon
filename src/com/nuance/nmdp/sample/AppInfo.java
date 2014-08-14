package com.nuance.nmdp.sample;

public class AppInfo
{
    /**
     * The login parameters should be specified in the following manner:
     * 
     * public static final String SpeechKitServer = "ndev.server.name";
     * 
     * public static final int SpeechKitPort = 1000;
     * 
     * public static final String SpeechKitAppId = "ExampleSpeechKitSampleID";
     * 
     * public static final byte[] SpeechKitApplicationKey =
     * {
     *     (byte)0x38, (byte)0x32, (byte)0x0e, (byte)0x46, (byte)0x4e, (byte)0x46, (byte)0x12, (byte)0x5c, (byte)0x50, (byte)0x1d,
     *     (byte)0x4a, (byte)0x39, (byte)0x4f, (byte)0x12, (byte)0x48, (byte)0x53, (byte)0x3e, (byte)0x5b, (byte)0x31, (byte)0x22,
     *     (byte)0x5d, (byte)0x4b, (byte)0x22, (byte)0x09, (byte)0x13, (byte)0x46, (byte)0x61, (byte)0x19, (byte)0x1f, (byte)0x2d,
     *     (byte)0x13, (byte)0x47, (byte)0x3d, (byte)0x58, (byte)0x30, (byte)0x29, (byte)0x56, (byte)0x04, (byte)0x20, (byte)0x33,
     *     (byte)0x27, (byte)0x0f, (byte)0x57, (byte)0x45, (byte)0x61, (byte)0x5f, (byte)0x25, (byte)0x0d, (byte)0x48, (byte)0x21,
     *     (byte)0x2a, (byte)0x62, (byte)0x46, (byte)0x64, (byte)0x54, (byte)0x4a, (byte)0x10, (byte)0x36, (byte)0x4f, (byte)0x64
     * };
     * 
     * Please note that all the specified values are non-functional
     * and are provided solely as an illustrative example.
     * 
     */

    /* Please contact Nuance to receive the necessary connection and login parameters */
    public static final String SpeechKitServer = "sslsandbox.nmdp.nuancemobility.net"; //Enter your server here// ;

    public static final int SpeechKitPort = 443; //Enter your port here ;
    
    public static final boolean SpeechKitSsl = true;

    public static final String SpeechKitAppId = "NMDPTRIAL_nhanltn20131127063250"; //Enter your ID here ;

    public static final byte[] SpeechKitApplicationKey = {
         /*Enter your application key here:
        (byte)0x00, (byte)0x01, ... (byte)0x00*/
        
    	
    	(byte)0x7c, (byte)0xf6, (byte)0x7f, (byte)0x47, (byte)0x9d, (byte)0xf9, (byte)0xed, (byte)0xbd, (byte)0xe7, (byte)0xbd, 
    	(byte)0x73, (byte)0x82, (byte)0xd8, (byte)0x18, (byte)0x19, (byte)0x42, (byte)0x6a, (byte)0x7e, (byte)0xae, (byte)0x23, 
    	(byte)0xad, (byte)0x9a, (byte)0x0f, (byte)0xfc, (byte)0xc5, (byte)0x7e, (byte)0x7d, (byte)0xf9, (byte)0x49, (byte)0x80, 
    	(byte)0xac, (byte)0xc5, (byte)0x76, (byte)0x2b, (byte)0x0c, (byte)0x13, (byte)0x25, (byte)0xf9, (byte)0xd0, (byte)0x0c, 
    	(byte)0xb6, (byte)0x43, (byte)0x8f, (byte)0x8f, (byte)0x5b, (byte)0xa8, (byte)0xd1, (byte)0xc6, (byte)0x26, (byte)0x7f, 
    	(byte)0xe9, (byte)0xd3, (byte)0x1a, (byte)0xf9, (byte)0xcf, (byte)0xdf, (byte)0x77, (byte)0x4c, (byte)0xd9, (byte)0xc0, 
    	(byte)0xcc, (byte)0x85, (byte)0x85, (byte)0x42
    };
	
	/*public static final String SpeechKitServer = "dictation.nuancemobility.net/NMDPAsrCmdServlet/dictation" Enter your server here ;

    public static final int SpeechKitPort = 443 Enter your port here ;
    
    public static final boolean SpeechKitSsl = false;

    public static final String SpeechKitAppId = "HTTP_NMDPPRODUCTION_Nhanltn_Ltd__ReadByKids_20140804064022" Enter your ID here ;

    public static final byte[] SpeechKitApplicationKey = {
         Application key here:
        (byte)0x00, (byte)0x01, ... (byte)0x00
        
    	//========ReadByKids
    	(byte)0x7d, (byte)0xf1, (byte)0x6d, (byte)0x68, (byte)0xb7, (byte)0xb8, (byte)0xb4, (byte)0xcd, (byte)0x98, (byte)0xfb, 
    	(byte)0x63, (byte)0x46, (byte)0x55, (byte)0x30, (byte)0xf6, (byte)0x48, (byte)0x30, (byte)0x8d, (byte)0x58, (byte)0xb1, 
    	(byte)0x81, (byte)0xd8, (byte)0xf6, (byte)0xe9, (byte)0x39, (byte)0x15, (byte)0x57, (byte)0xda, (byte)0x9e, (byte)0xc7, 
    	(byte)0xe1, (byte)0x1c, (byte)0xb9, (byte)0x4e, (byte)0x84, (byte)0x70, (byte)0x06, (byte)0x39, (byte)0x3d, (byte)0x9e, 
    	(byte)0x34, (byte)0xa0, (byte)0xe5, (byte)0x89, (byte)0xd0, (byte)0xdb, (byte)0xd1, (byte)0x01, (byte)0x68, (byte)0x29, 
    	(byte)0xb2, (byte)0xe9, (byte)0x01, (byte)0xa8, (byte)0xd2, (byte)0x3a, (byte)0xbe, (byte)0x2a, (byte)0x14, (byte)0x5c, 
    	(byte)0xf1, (byte)0xf5, (byte)0x78, (byte)0xaa

    };*/
}
