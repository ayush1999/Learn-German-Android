/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.LineNumberReader;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> s = new ArrayList<String>();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");
        s.add("six");
        s.add("seven");
        s.add("eight");
        s.add("nine");
        s.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for(int i=0;i<10;i++) {
            TextView wordView = new TextView(this);
            wordView.setText(s.get(i));
            rootView.addView(wordView);
        }
    }
}
