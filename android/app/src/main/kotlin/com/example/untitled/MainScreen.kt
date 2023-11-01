/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.untitled

import android.text.Spannable
import android.text.SpannableString
import android.util.Log
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*


class MainScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {

        val itemListBuilder = ItemList.Builder()
            .setNoItemsMessage("No places to show")

        arrayListOf<String>("Mohamed Salah", "Ma`3rabi", "Tarek", "Mo2men", "Tamer", "Adham")
            .forEach {
                itemListBuilder.addItem(
                    Row.Builder()
                        .setTitle(it)
                        // Each item in the list *must* have a DistanceSpan applied to either the title
                        // or one of the its lines of text (to help drivers make decisions)
                        .addText("Mobile team member")
                        .build()
                )
            }

        return ListTemplate.Builder()
            .setTitle("Our names:")
            .setSingleList(itemListBuilder.build())
            .build()

//        return PlaceListMapTemplate.Builder()
//            .setTitle("Our names:")
//            .setItemList(itemListBuilder.build())
//            .build()
    }
}