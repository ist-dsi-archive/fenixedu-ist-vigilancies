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
package org.fenixedu.academic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fenixedu.academic.domain.exceptions.DomainException;
import org.fenixedu.academic.domain.vigilancy.VigilantGroup;
import org.fenixedu.academic.domain.vigilancy.VigilantWrapper;

import pt.ist.fenixframework.Atomic;

public class RemoveVigilantsFromGroup {

    @Atomic
    public static List<VigilantWrapper> run(Map<VigilantGroup, List<VigilantWrapper>> vigilantsToRemove) {

        List<VigilantWrapper> unableToRemove = new ArrayList<VigilantWrapper>();

        Set<VigilantGroup> groups = vigilantsToRemove.keySet();

        for (VigilantGroup group : groups) {
            List<VigilantWrapper> vigilantWrappers = vigilantsToRemove.get(group);

            for (VigilantWrapper vigilantWrapper : vigilantWrappers) {
                try {
                    vigilantWrapper.delete();
                } catch (DomainException e) {
                    unableToRemove.add(vigilantWrapper);
                }
            }
        }
        return unableToRemove;
    }
}