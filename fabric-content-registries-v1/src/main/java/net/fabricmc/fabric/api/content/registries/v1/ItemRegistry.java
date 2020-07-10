/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package net.fabricmc.fabric.api.content.registries.v1;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.event.registries.v1.RegistryItemAddedCallback;
import net.fabricmc.fabric.impl.content.registries.ContentRegistryImpl;

public final class ItemRegistry {
	public static boolean itemIdsSetup = false;

	private ItemRegistry() {
	}

	public static Item register(Identifier id, Item item) {
		RegistryItemAddedCallback.EVENT.invoker().itemAdded(id,item);
		return ContentRegistryImpl.registerItem(id, item);
	}

	public static Item registerBlockItem(Identifier id, Item item) {
		RegistryItemAddedCallback.EVENT.invoker().itemAdded(id,item);
		return ContentRegistryImpl.registerItem(id, item);
	}
}
