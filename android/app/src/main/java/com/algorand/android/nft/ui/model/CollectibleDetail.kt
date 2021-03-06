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

package com.algorand.android.nft.ui.model

import android.os.Parcelable
import com.algorand.android.models.BaseAccountAddress.AccountAddress
import kotlinx.parcelize.Parcelize

sealed class CollectibleDetail : Parcelable {

    abstract val isOwnedByTheUser: Boolean
    abstract val ownerAccountAddress: AccountAddress

    abstract val isHoldingByWatchAccount: Boolean

    abstract val collectibleId: Long
    abstract val collectibleName: String?
    abstract val collectibleDescription: String?
    abstract val collectibleTraits: List<CollectibleTraitItem>?

    abstract val collectionName: String?

    abstract val creatorName: String?
    abstract val creatorWalletAddress: AccountAddress?

    abstract val warningTextRes: Int?
    abstract val optedInWarningTextRes: Int?

    abstract val isPeraExplorerVisible: Boolean
    abstract val peraExplorerUrl: String?

    abstract val collectibleMedias: List<BaseCollectibleMediaItem>

    abstract val isVerified: Boolean

    abstract val collectibleFractionDecimals: Int?

    abstract val isPure: Boolean

    @Parcelize
    data class ImageCollectibleDetail(
        override val isOwnedByTheUser: Boolean,
        override val collectionName: String?,
        override val collectibleName: String?,
        override val collectibleDescription: String?,
        override val ownerAccountAddress: AccountAddress,
        override val collectibleId: Long,
        override val creatorName: String?,
        override val creatorWalletAddress: AccountAddress?,
        override val isHoldingByWatchAccount: Boolean,
        override val warningTextRes: Int?,
        override val collectibleTraits: List<CollectibleTraitItem>?,
        override val isPeraExplorerVisible: Boolean,
        override val peraExplorerUrl: String?,
        override val collectibleMedias: List<BaseCollectibleMediaItem>,
        override val isVerified: Boolean,
        override val optedInWarningTextRes: Int?,
        override val collectibleFractionDecimals: Int?,
        override val isPure: Boolean,
        val prismUrl: String?
    ) : CollectibleDetail()

    @Parcelize
    data class VideoCollectibleDetail(
        override val isOwnedByTheUser: Boolean,
        override val collectionName: String?,
        override val collectibleName: String?,
        override val collectibleDescription: String?,
        override val ownerAccountAddress: AccountAddress,
        override val collectibleId: Long,
        override val creatorName: String?,
        override val creatorWalletAddress: AccountAddress?,
        override val isHoldingByWatchAccount: Boolean,
        override val warningTextRes: Int?,
        override val collectibleTraits: List<CollectibleTraitItem>?,
        override val isPeraExplorerVisible: Boolean,
        override val peraExplorerUrl: String?,
        override val collectibleMedias: List<BaseCollectibleMediaItem.VideoCollectibleMediaItem>,
        override val isVerified: Boolean,
        override val optedInWarningTextRes: Int?,
        override val collectibleFractionDecimals: Int?,
        override val isPure: Boolean,
        val prismUrl: String?
    ) : CollectibleDetail()

    @Parcelize
    data class MixedCollectibleDetail(
        override val isOwnedByTheUser: Boolean,
        override val collectionName: String?,
        override val collectibleName: String?,
        override val collectibleDescription: String?,
        override val ownerAccountAddress: AccountAddress,
        override val collectibleId: Long,
        override val creatorName: String?,
        override val creatorWalletAddress: AccountAddress?,
        override val isHoldingByWatchAccount: Boolean,
        override val warningTextRes: Int?,
        override val collectibleTraits: List<CollectibleTraitItem>?,
        override val isPeraExplorerVisible: Boolean,
        override val peraExplorerUrl: String?,
        override val collectibleMedias: List<BaseCollectibleMediaItem>,
        override val isVerified: Boolean,
        override val optedInWarningTextRes: Int?,
        override val collectibleFractionDecimals: Int?,
        override val isPure: Boolean,
        val prismUrl: String?
    ) : CollectibleDetail()

    @Parcelize
    data class NotSupportedCollectibleDetail(
        override val isOwnedByTheUser: Boolean,
        override val ownerAccountAddress: AccountAddress,
        override val isHoldingByWatchAccount: Boolean,
        override val collectibleId: Long,
        override val collectibleName: String?,
        override val collectibleDescription: String?,
        override val collectibleTraits: List<CollectibleTraitItem>?,
        override val collectionName: String?,
        override val creatorName: String?,
        override val creatorWalletAddress: AccountAddress?,
        override val warningTextRes: Int?,
        override val isPeraExplorerVisible: Boolean,
        override val peraExplorerUrl: String?,
        override val collectibleMedias: List<BaseCollectibleMediaItem>,
        override val optedInWarningTextRes: Int?,
        override val isVerified: Boolean,
        override val collectibleFractionDecimals: Int?,
        override val isPure: Boolean,
    ) : CollectibleDetail()
}
