/*
 * This file is part of Hopsworks
 * Copyright (C) 2019, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package io.hops.hopsworks.common.featurestore.featuregroup.cached;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DTO containing a column query result in String format
 * using jaxb.
 */
@XmlRootElement
@XmlType(propOrder = {"name", "value"})
public class ColumnValueQueryResult {

  private String name;
  private String value;

  public ColumnValueQueryResult(){}

  public ColumnValueQueryResult(String name, String value) {
    this.name = name;
    this.value = value;
  }

  @XmlElement
  public String getName() {
    return name;
  }

  @XmlElement
  public String getValue() {
    return value;
  }
}