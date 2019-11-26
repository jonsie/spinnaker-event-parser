# spinnaker-event-parser

_**IMPORTANT: This is an incubating project.**_

Parses `echo` events.  Addresses the common pattern of parsing events in a downstream service 
(for use in an event pipeline, for example).

Also can serve to remove the partially implemented (and likely unused) `RestEventTemplateEngine` 
in `echo-rest`.

## Notes on implementation

Tracking my thoughts on first pass at implementation so I can review things afterwards:
