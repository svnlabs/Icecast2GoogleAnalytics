/*     Copyright 2017 SWI Kommunikations- und Computer GmbH
*
*        Licensed under the Apache License, Version 2.0 (the "License");
*        you may not use this file except in compliance with the License.
*        You may obtain a copy of the License at
*
*        http://www.apache.org/licenses/LICENSE-2.0
*
*        Unless required by applicable law or agreed to in writing, software
*       distributed under the License is distributed on an "AS IS" BASIS,
*        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*        See the License for the specific language governing permissions and
*        limitations under the License.
*/

package com.coherentreceiver.analytics.task;

import com.coherentreceiver.analytics.configuration.MountpointsGAAccount;
import com.coherentreceiver.analytics.configuration.Server;
import com.coherentreceiver.analytics.fetcher.ListenersFetcher;
import com.coherentreceiver.analytics.fetcher.ServerStatsFetcher;
import com.coherentreceiver.analytics.helper.idgenerator.IDGeneratorFactory;
import com.coherentreceiver.analytics.helper.decoding.DecoderFactory;
import com.coherentreceiver.analytics.icecastmodel.listclients.Listeners;
import com.coherentreceiver.analytics.icecastmodel.stats.RadioStream;
import com.coherentreceiver.analytics.icecastmodel.stats.ServerStats;
import com.coherentreceiver.analytics.icecastmodel.stats.StreamProperty;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 */
public class IcecastXMLParserTask extends AbstractTask <StreamProperty> implements Runnable {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IcecastXMLParserTask.class);
    protected Server server;
    protected String UNKNOWNTITLE = "NO_TITLE";



    public IcecastXMLParserTask (){}


    public void run() {

        //multithreaded version

    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

}
