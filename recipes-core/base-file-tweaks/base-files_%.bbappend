SRC_URI += " file://fstab"

do_install_append () {
 # Swap in our own fstab file.
 install -m 0644 ${WORKDIR}/fstab ${D}${sysconfdir}/fstab
}
