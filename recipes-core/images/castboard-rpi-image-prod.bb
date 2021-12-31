SUMMARY = "Castboard image for Production/Release purposes"
LICENSE="MIT"

include ./castboard-rpi-image-base.bb

# Add an Additional 2gb of free space to the image.
IMAGE_ROOTFS_EXTRA_SPACE_append = " + 2000000"



