SUMMARY = "Castboard base image"
LICENSE="MIT"

# Base this image on core-image-base
# poky-centerstage includes the wayland support
include recipes-core/images/core-image-base.bb

DISTRO = "poky-centerstage"

COMPATIBLE_MACHINE = "^rpi$"


# OUTPUT IMAGE TYPE
IMAGE_FSTYPES = "ext3.xz rpi-sdimg"

# Jwinarske stuff - https://github.com/jwinarske/meta-flutter
IMAGE_INSTALL += "   packagegroup-core-selinux   avahi-daemon   vulkan-loader vulkan-tools   adwaita-icon-theme-cursors   xdg-user-dirs "
PREFERRED_VERSION_pipewire = "0.3.22"

# Networking Support
IMAGE_INSTALL_append = " hostapd"
IMAGE_INSTALL_append = " dnsmasq"

# Web Servers
IMAGE_INSTALL_append = " nginx"

#
# Scripts
#
IMAGE_INSTALL_append = " castboard-autorun"

#
# User Facing Software
#

# Flutter Embedders
# No longer required as we have migrated to flutter-elinux tools which handles the embedder internally.
#IMAGE_INSTALL_append = " flutter-pi"
#IMAGE_INSTALL_append = " flutter-drm-gbm-backend"

# Flutter Applications
IMAGE_INSTALL_append = " castboard-player"


