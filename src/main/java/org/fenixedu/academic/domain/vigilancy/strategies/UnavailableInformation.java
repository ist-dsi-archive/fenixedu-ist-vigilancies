/**
 * Copyright © 2011 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Exam Vigilancies.
 *
 * FenixEdu Exam Vigilancies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Exam Vigilancies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Exam Vigilancies.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.academic.domain.vigilancy.strategies;

import java.io.Serializable;

import org.fenixedu.academic.domain.vigilancy.UnavailableTypes;
import org.fenixedu.academic.domain.vigilancy.VigilantWrapper;

public class UnavailableInformation implements Serializable {

    private VigilantWrapper vigilant;
    private UnavailableTypes unavailableReason;

    UnavailableInformation(VigilantWrapper vigilant, UnavailableTypes unavailableReason) {
        this.vigilant = vigilant;
        this.unavailableReason = unavailableReason;
    }

    public VigilantWrapper getVigilant() {
        return this.vigilant;
    }

    public UnavailableTypes getReason() {
        return this.unavailableReason;
    }
}
