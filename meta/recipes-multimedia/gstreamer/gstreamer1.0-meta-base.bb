DESCRIPTION = "Gstreamer1.0 package groups"
LICENSE = "MIT"

inherit packagegroup

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-bad"

PACKAGES = "\
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-x11-base \
    gstreamer1.0-meta-audio \
    gstreamer1.0-meta-debug \
    gstreamer1.0-meta-video"

ALLOW_EMPTY_gstreamer1.0-meta-base = "1"
ALLOW_EMPTY_gstreamer1.0-meta-x11-base = "1"
ALLOW_EMPTY_gstreamer1.0-meta-audio = "1"
ALLOW_EMPTY_gstreamer1.0-meta-debug = "1"
ALLOW_EMPTY_gstreamer1.0-meta-video = "1"

RDEPENDS_gstreamer1.0-meta-base = "\
    ${@base_contains('DISTRO_FEATURES', 'x11', 'gstreamer1.0-meta-x11-base', '', d)} \
    gstreamer1.0 \
    gstreamer1.0-plugins-base-playback \
    gstreamer1.0-plugins-base-gio \
    gstreamer1.0-plugins-base-alsa \
    gstreamer1.0-plugins-base-volume \
    gstreamer1.0-plugins-base-audioconvert \
    gstreamer1.0-plugins-base-audioresample \
    gstreamer1.0-plugins-base-typefindfunctions \
    gstreamer1.0-plugins-base-videoscale \
    gstreamer1.0-plugins-base-videoconvert \
    gstreamer1.0-plugins-good-autodetect \
    gstreamer1.0-plugins-good-souphttpsrc"

RRECOMMENDS_gstreamer1.0-meta-x11-base = "\
    gstreamer1.0-plugins-base-ximagesink \
    gstreamer1.0-plugins-base-xvimagesink"

RDEPENDS_gstreamer1.0-meta-audio = "\
    gstreamer1.0-meta-base \
    gstreamer1.0-plugins-base-vorbis \
    gstreamer1.0-plugins-base-ogg \
    gstreamer1.0-plugins-good-wavparse \
    gstreamer1.0-plugins-good-flac \
    ${COMMERCIAL_AUDIO_PLUGINS}"

RDEPENDS_gstreamer1.0-meta-debug = "\
    gstreamer1.0-meta-base \
    gstreamer1.0-plugins-good-debug \
    gstreamer1.0-plugins-base-audiotestsrc \
    gstreamer1.0-plugins-base-videotestsrc"

RDEPENDS_gstreamer1.0-meta-video = "\
    gstreamer1.0-meta-base \
    gstreamer1.0-plugins-good-avi \
    gstreamer1.0-plugins-good-matroska \
    gstreamer1.0-plugins-base-theora \
    ${COMMERCIAL_VIDEO_PLUGINS}"

RRECOMMENDS_gstreamer1.0-meta-video = "\
    gstreamer1.0-meta-audio"
