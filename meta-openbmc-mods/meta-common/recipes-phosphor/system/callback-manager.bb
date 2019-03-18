SUMMARY = "Callback Manager"
DESCRIPTION = "D-Bus daemon that registers matches that trigger method calls"

SRC_URI = "git://git@github.com/Intel-BMC/provingground;protocol=ssh"

inherit cmake systemd
DEPENDS = "boost sdbusplus"

PV = "0.1+git${SRCPV}"
SRCREV = "c927781ad3ca1408cd7fb0b7cc2538ea10ded76b"

S = "${WORKDIR}/git/callback-manager"

SYSTEMD_SERVICE_${PN} += "callback-manager.service"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=7becf906c8f8d03c237bad13bc3dac53"

EXTRA_OECMAKE = "-DYOCTO=1"