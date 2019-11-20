# spinnaker-event-parser

Event parser for Spinnaker such that remote Event parses are not necessary.

## Notes on implementation

Tracking my thoughts on first pass at implementation so I can review things afterwards:

### Why is `@SpinnakerExtension` necessary?  

Is there a better, simpler, way to add `namespace` and `id` metadata?  Or, if this annotation 
really is required - we should look at improving the current API such that we don't to use both
`@SpinnakerExtension` and `@Extension`.

