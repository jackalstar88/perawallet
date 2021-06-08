/*
 * Copyright 2019 Algorand, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.algorand.android.core

import androidx.annotation.LayoutRes
import com.algorand.android.utils.analytics.logScreen
import com.google.firebase.analytics.FirebaseAnalytics
import javax.inject.Inject

abstract class DaggerBaseBottomSheet(
    @LayoutRes layoutResId: Int,
    fullPageNeeded: Boolean,
    val firebaseEventScreenId: String?
) : BaseBottomSheet(layoutResId, fullPageNeeded) {

    @Inject
    lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onResume() {
        super.onResume()
        logScreen()
    }

    private fun logScreen() {
        firebaseEventScreenId?.let {
            firebaseAnalytics.logScreen(it)
        }
    }
}
