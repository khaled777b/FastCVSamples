/*==============================================================================
            Copyright (c) 2010-2011 Qualcomm Technologies Incorporated.
            All Rights Reserved.
            Qualcomm Confidential and Proprietary
==============================================================================*/

package com.qualcomm.fastcvdemo.apis;
 
import com.qualcomm.fastcvdemo.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;
 
/**
 * Basic empty About class. All configurations for 
 * About menu is done in the xml file. 
 * 
 */
public class About extends PreferenceActivity 
{
   /** Called when the activity is first created. */
   @Override
   protected void onCreate( Bundle savedInstanceState ) 
   {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource( R.layout.about );
   }
}

