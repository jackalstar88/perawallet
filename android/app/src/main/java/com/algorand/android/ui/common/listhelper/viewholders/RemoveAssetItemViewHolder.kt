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

package com.algorand.android.ui.common.listhelper.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.algorand.android.R
import com.algorand.android.databinding.ItemRemoveAssetBinding
import com.algorand.android.models.AssetInformation
import com.algorand.android.ui.common.listhelper.BaseAccountListItem

class RemoveAssetItemViewHolder(
    val binding: ItemRemoveAssetBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(removeAssetListItem: RemoveAssetListItem, showDivider: Boolean) {
        itemView.apply {
            setBackgroundResource(
                if (showDivider) {
                    R.drawable.bg_account_list_middle_item
                } else {
                    R.drawable.bg_account_list_bottom_item
                }
            )
        }

        binding.nameTextView.setupUI(removeAssetListItem.assetInformation)

        binding.dividerView.isVisible = showDivider
    }

    companion object {
        fun create(parent: ViewGroup): RemoveAssetItemViewHolder {
            val binding = ItemRemoveAssetBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return RemoveAssetItemViewHolder(binding)
        }
    }
}

data class RemoveAssetListItem(
    val publicKey: String,
    val assetInformation: AssetInformation
) : BaseAccountListItem()
