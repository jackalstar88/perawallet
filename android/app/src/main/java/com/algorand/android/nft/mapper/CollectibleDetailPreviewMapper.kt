/*
 * Copyright 2022 Pera Wallet, LDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.algorand.android.nft.mapper

import com.algorand.android.nft.ui.model.CollectibleDetail
import com.algorand.android.nft.ui.model.CollectibleDetailPreview
import com.algorand.android.utils.Event
import javax.inject.Inject

class CollectibleDetailPreviewMapper @Inject constructor() {

    fun mapTo(
        isLoadingVisible: Boolean,
        isSendButtonVisible: Boolean,
        isErrorVisible: Boolean,
        collectibleDetail: CollectibleDetail,
        optOutSuccessEvent: Event<Unit>? = null,
        globalErrorEvent: Event<String>? = null,
        fractionalCollectibleSendEvent: Event<Unit>? = null,
        pureCollectibleSendEvent: Event<Unit>? = null
    ): CollectibleDetailPreview {
        return CollectibleDetailPreview(
            isLoadingVisible = isLoadingVisible,
            isSendButtonVisible = isSendButtonVisible,
            isErrorVisible = isErrorVisible,
            collectibleDetail = collectibleDetail,
            optOutSuccessEvent = optOutSuccessEvent,
            globalErrorEvent = globalErrorEvent,
            fractionalCollectibleSendEvent = fractionalCollectibleSendEvent,
            pureCollectibleSendEvent = pureCollectibleSendEvent
        )
    }

    fun mapToLoading(): CollectibleDetailPreview {
        return CollectibleDetailPreview(
            isLoadingVisible = true,
            isSendButtonVisible = false,
            isErrorVisible = false,
            collectibleDetail = null,
            optOutSuccessEvent = null,
            globalErrorEvent = null,
            fractionalCollectibleSendEvent = null,
            pureCollectibleSendEvent = null
        )
    }
}
