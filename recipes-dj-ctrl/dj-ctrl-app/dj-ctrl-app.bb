SUMMARY = "Qt6 Quick application from AdrienCorvasier/dj-ctrl-app"
DESCRIPTION = "Builds the dj-ctrl-app Qt6 Quick application from GitHub using CMake."
HOMEPAGE = "https://github.com/AdrienCorvasier/dj-ctrl-app"
LICENSE = "CLOSED"

PV = "0.1+git${SRCPV}"
SRC_URI = "git://github.com/AdrienCorvasier/dj-ctrl-app.git;protocol=https;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit qt6-cmake

DEPENDS := " \
        qtbase \
        qtdeclarative \ 
        qttools \
        qttools-native \
        networkmanager-qt"

RDEPENDS:${PN} += " \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    networkmanager \
    networkmanager-qt \
"