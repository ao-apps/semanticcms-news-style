/*
 * semanticcms-news-style - Default style for SemanticCMS newsfeeds.
 * Copyright (C) 2016, 2017, 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-news-style.
 *
 * semanticcms-news-style is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-news-style is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-news-style.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.news.style;

import com.aoindustries.web.resources.registry.Style;
import com.aoindustries.web.resources.servlet.RegistryEE;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("Registers the styles for SemanticCMS newsfeeds in RegistryEE.")
public class NewsStyle implements ServletContextListener {

	public static final Style SEMANTICCMS_AUTOGIT = new Style("/semanticcms-news-style/semanticcms-news.css");

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO: Only add this style to the news view
		// Add our CSS file
		RegistryEE.get(event.getServletContext()).global.styles.add(SEMANTICCMS_AUTOGIT);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Do nothing
	}
}
