/*******************************************************************************
 * Copyright 2019 Stanley
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.angsanley.binusgls1.characters;

public class BaseCharacter {
	private String name = "";
	private String description = "";
	
	public BaseCharacter(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// menurut saya lebih masuk akal kalau namanya printInfo, bukan getInfo.
	public void printInfo() {
		System.out.println(name + ", " + description);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
