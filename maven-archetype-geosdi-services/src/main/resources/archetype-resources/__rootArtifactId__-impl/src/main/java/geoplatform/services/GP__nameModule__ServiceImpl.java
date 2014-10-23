/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2014 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package ${package}.geoplatform.services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.jws.WebService;
import org.geosdi.geoplatform.core.dao.GPAccountProjectDAO;
import org.geosdi.geoplatform.core.dao.GPProjectDAO;
import org.geosdi.geoplatform.core.model.GPAccount;
import org.geosdi.geoplatform.core.model.GPAccountProject;
import org.geosdi.geoplatform.core.model.GPProject;
import org.geosdi.geoplatform.exception.ResourceNotFoundFault;
import org.geosdi.geoplatform.gui.shared.XMPPSubjectEnum;
import org.geosdi.geoplatform.responce.collection.XmppAttributesMap;
import org.geosdi.geoplatform.services.development.EntityCorrectness;
import org.geosdi.geoplatform.services.development.EntityCorrectnessException;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.quartz.CalendarIntervalScheduleBuilder;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author *** - CNR IMAA geoSDI Group
 * @email ***
 */
@WebService(endpointInterface = "${package}.geoplatform.services.GP${nameModule}Service")
public class GP${nameModule}ServiceImpl implements GP${nameModule}Service, InitializingBean {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public GP${nameModule}ServiceImpl(String host_xmpp_server, String port_xmpp_server,
            String username_xmpp_server, String password_xmpp_server) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public boolean unscribeLayerNotification(String username, String layerUUID) {
        return true;
    }


    @Override
    public void subscribeLayerNotification(String username, String emiteResource,
            String layerUUID, int secondToRefresh) {

    }

    /**
     * @see GP${nameModule}Service#sendSharedProjectNotification(java.lang.Long,
     * org.geosdi.geoplatform.services.XMPPSubjectServerEnum, java.lang.String,
     * org.geosdi.geoplatform.responce.collection.XmppAttributesMap)
     */
    @Override
    public void sendSharedProjectNotification(Long projectID, XMPPSubjectEnum subject,
            String text, XmppAttributesMap attributesMap) throws ResourceNotFoundFault {

    }
}
