# Even though this recipe is in reference to polkit. It is the systemd recipe that creates the policy files.

SRC_URI += " file://org.freedesktop.systemd1.policy"

do_install_append () {
 # Install our own tweaked systemd policy file.
 install -m 0644 ${WORKDIR}/org.freedesktop.systemd1.policy ${D}${datadir}/polkit-1/actions/
}
