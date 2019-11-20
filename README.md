# spinnaker-event-parser

_**IMPORTANT: This is an incubating project.**_

Parses `echo` events.  Addresses the common pattern of parsing events in a downstream service 
(for use in an event pipeline, for example).

Also can serve to remove the partially implemented (and likely unused) `RestEventTemplateEngine` 
in `echo-rest`.

## Notes on implementation

Tracking my thoughts on first pass at implementation so I can review things afterwards:

### dependency issues

Looks like `pf4j` is a required dependency for plugins right now - since the plugin needs to extend
`org.pf4j.Plugin` and the implementation requires `org.pf4j.PluginWrapper`.

There is an attempt to not leak `pf4j` via `@SpinnakerExtension`, however that looks incomplete as 
`org.pf4j.Extension` is still required.
