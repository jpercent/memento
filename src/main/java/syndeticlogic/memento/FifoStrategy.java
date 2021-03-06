package syndeticlogic.memento;
/*
 * Copyright 2010, 2011 James Percent
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

import syndeticlogic.memento.Cache.CacheNode;

/**
 * Class FifoStrategy
 * 
 * @author <a href="mailto:james@empty-set.net">James Percent</a>
 * @version $Revision: 1.0 $
 */
public class FifoStrategy extends AbstractPolicyStrategy {

	public FifoStrategy(
			EvictionListener listener, int maxSize, long timeoutMilliSeconds) {
		super(listener, maxSize, timeoutMilliSeconds);
	}

	@Override
	public final void revalueNode(Cache.CacheNode cacheNode) {
	}

	@Override
	public CacheNode createNode() {
		return new BaseNode();
	}
}
