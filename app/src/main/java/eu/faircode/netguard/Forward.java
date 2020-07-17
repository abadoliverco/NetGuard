package eu.faircode.netguard;

/*
    This file is part of Nexplay.

    Nexplay is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Nexplay is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Nexplay.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2015-2019 by Marcel Bokhorst (M66B)
*/

public class Forward {
    public int protocol;
    public int dport;
    public String raddr;
    public int rport;
    public int ruid;

    @Override
    public String toString() {
        return "protocol=" + protocol + " port " + dport + " to " + raddr + "/" + rport + " uid " + ruid;
    }
}
