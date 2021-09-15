SUMMARY = "Castboard image for Development purposes"
LICENSE="MIT"

include ./castboard-rpi-image-base.bb


IMAGE_FEATURES += "debug-tweaks ssh-server-dropbear"

#
# Scripts
#
IMAGE_INSTALL_remove = " castboard-autorun"
IMAGE_INSTALL_append = " cage-autorun"

IMAGE_INSTALL_append = " cage"
SYSTEMD_DEFAULT_TARGET = "graphical.target"






