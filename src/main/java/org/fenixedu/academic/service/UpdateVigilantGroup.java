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

import org.fenixedu.academic.domain.vigilancy.VigilantGroup;
import org.joda.time.DateTime;

import pt.ist.fenixframework.Atomic;

public class UpdateVigilantGroup {

    @Atomic
    public static void run(VigilantGroup vigilantGroup, String name, String convokeStrategy, String contactEmail,
            String emailPrefix, String rulesLink, DateTime beginFirst, DateTime endFirst, DateTime beginSecond, DateTime endSecond) {

        vigilantGroup.setName(name);
        vigilantGroup.setConvokeStrategy(convokeStrategy);
        vigilantGroup.setContactEmail(contactEmail);
        vigilantGroup.setEmailSubjectPrefix(emailPrefix);
        vigilantGroup.setRulesLink(rulesLink);
        vigilantGroup.setBeginOfFirstPeriodForUnavailablePeriods(beginFirst);
        vigilantGroup.setEndOfFirstPeriodForUnavailablePeriods(endFirst);
        vigilantGroup.setBeginOfSecondPeriodForUnavailablePeriods(beginSecond);
        vigilantGroup.setEndOfSecondPeriodForUnavailablePeriods(endSecond);

    }

}