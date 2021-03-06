/*
 * Copyright (c) 2013 - 2016 Trojaner <trojaner25@gmail.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.static_interface.sinksql.query.impl;

import de.static_interface.sinksql.Row;
import de.static_interface.sinksql.query.MasterQuery;
import de.static_interface.sinksql.query.condition.WhereCondition;

public class DeleteQuery<T extends Row> extends MasterQuery<T> {
    public DeleteQuery(FromQuery<T> parent) {
        super(parent);
    }

    public WhereQuery<T> where(String columName, WhereCondition condition) {
        WhereQuery<T> query = new WhereQuery(this, columName, condition);
        setChild(query);
        return query;
    }
}
