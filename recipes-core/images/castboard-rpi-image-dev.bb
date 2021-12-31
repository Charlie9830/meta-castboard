SUMMARY = "Castboard image for Development purposes"
LICENSE="MIT"

include ./castboard-rpi-image-base.bb


IMAGE_FEATURES += "debug-tweaks ssh-server-dropbear"
IMAGE_INSTALL += "strace procps"

# Append an extra 500mb to the available Space.
IMAGE_ROOTFS_EXTRA_SPACE_append = " + 500000"

#
# For running with Cage Compositor.
#
IMAGE_INSTALL_append = " cage-autorun"
IMAGE_INSTALL_append = " cage"
SYSTEMD_DEFAULT_TARGET = "graphical.target"





