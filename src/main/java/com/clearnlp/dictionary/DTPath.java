/**
 * Copyright 2014, Emory University
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
package com.clearnlp.dictionary;

/**
 * @since 3.0.0
 * @author Jinho D. Choi ({@code jdchoi77@gmail.com})
 */
public interface DTPath
{
	String PATH_DICTIONARY	= "com/clearnlp/dictionary/";
	String PATH_UNIVERSAL	= PATH_DICTIONARY + "universal/";
	String PATH_ENGLISH		= PATH_DICTIONARY + "english/";
	
	// universal dictionary
	String PATH_CURRENCY_DOLLAR	= PATH_UNIVERSAL + "currency-dollar.txt";
	String PATH_CURRENCY		= PATH_UNIVERSAL + "currency.txt";
	String PATH_EMOTICON		= PATH_UNIVERSAL + "emoticons.txt";
	String PATH_UNICODE			= PATH_UNIVERSAL + "unicode.txt";
	String PATH_HTML_TAGS		= PATH_UNIVERSAL + "html-tags.txt";
	
	
	
	String ABBREVIATIONS = PATH_DICTIONARY + "abbreviations.txt";
	String COMPOUNDS     = PATH_DICTIONARY + "compounds.txt";
	String HYPHENS       = PATH_DICTIONARY + "hyphens.txt";
	String UNITS         = PATH_DICTIONARY + "units.txt";
}
