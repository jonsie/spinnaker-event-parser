# spinnaker-event-parser

_**IMPORTANT: This is an incubating project.**_

A plugin to parse events prior to POSTing to a remote service.  Addresses the common pattern of 
parsing events in a downstream service (for use in an event pipeline, for example).

Also can serve to remove the half-baked the `echo-rest` `RestEventTemplateEngine`.

## Notes on implementation

Tracking my thoughts on first pass at implementation so I can review things afterwards:

### Why is `@SpinnakerExtension` necessary?  

Is there a better, simpler, way to add `namespace` and `id` metadata?  Or, if this annotation 
really is required - we should look at improving the current API such that we don't to use both
`@SpinnakerExtension` and `@Extension`.

