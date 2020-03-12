#!/bin/bash

# Only look to the latest release to determine the previous tag -- this allows us to skip unsupported tag formats (like `version-1.0.0`)
export PREVIOUS_TAG=`curl --silent "https://api.github.com/repos/jonsie/${{ github.event.repository.name }}/releases/latest" | grep '"tag_name":' | sed -E 's/.*"([^"]+)".*/\1/'`
export NEW_TAG=${{ github.ref }}
export CHANGELOG=`git log $NEW_TAG..$PREVIOUS_TAG --pretty=format:"%s"`

# If the previous release tag is the same as this tag the user likely cut a release (and in the process created a tag), which means we can skip the need to create a release
export SKIP_RELEASE=`[[ "$PREVIOUS_TAG" = "$NEW_TAG" ]] && echo "true" || echo "false"`