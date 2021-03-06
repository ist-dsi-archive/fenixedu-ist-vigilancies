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

import java.util.ArrayList;
import java.util.List;

import org.fenixedu.academic.domain.vigilancy.VigilantWrapper;

public class StrategySugestion {

    private List<VigilantWrapper> vigilantsThatAreTeachers;

    private List<VigilantWrapper> sugestedVigilants;

    private List<UnavailableInformation> unavailableVigilants;

    public StrategySugestion(List<VigilantWrapper> teachers, List<VigilantWrapper> sugestion,
            List<UnavailableInformation> unvailables) {
        this.vigilantsThatAreTeachers = teachers;
        this.sugestedVigilants = sugestion;
        this.unavailableVigilants = unvailables;

    }

    public List<VigilantWrapper> getVigilantSugestion() {
        return sugestedVigilants;
    }

    public List<UnavailableInformation> getUnavailableVigilantsWithInformation() {
        return unavailableVigilants;
    }

    public List<VigilantWrapper> getUnavailableVigilants() {
        List<VigilantWrapper> vigilants = new ArrayList<VigilantWrapper>();
        for (UnavailableInformation information : unavailableVigilants) {
            vigilants.add(information.getVigilant());
        }
        return vigilants;
    }

    public List<VigilantWrapper> getVigilantsThatAreTeachersSugestion() {
        return vigilantsThatAreTeachers;
    }

}
