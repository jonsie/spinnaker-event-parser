package io.spinnaker.jonsie.eventparser;


import com.netflix.spinnaker.echo.extension.rest.RestEventParser;
import com.netflix.spinnaker.kork.plugins.SpinnakerExtension;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.util.HashMap;
import java.util.Map;


public class EventParserPlugin extends Plugin {

    public EventParserPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Extension
    @SpinnakerExtension(id = "io.spinnaker.jonsie.eventparser")
    public static class EventParser implements RestEventParser {

        @Override
        public Map<String, Object> parseEvent(Event event) {
            Map<String, Object> m = new HashMap<>();

            m.put("foo", "bar");
            m.put("baz", "bizzle");

            return m;
        }

        @Override
        public FlatEvent flattenEvent(Event event) {
            return new FlatEvent("details", "content");
        }
    }
}
