SUMMARY = "Minimal Qt image with dj-ctrl-app"
DESCRIPTION = "A custom minimal image for dj-ctrl-app with only the necessary Qt runtime packages."

IMAGE_INSTALL = "packagegroup-core-boot \
                 qtbase-plugins \
                 qtdeclarative-qmlplugins \
                 qtwayland \
                 qtwayland-plugins \
                 dj-ctrl-app \
                 build-info-openstlinux \
                 packagegroup-core-ssh-openssh \
                 dhcpcd \
                 fontconfig \
                 ttf-dejavu-sans \
                 glibc-localedata-en-us \
                 locale-base-en-us \
"

GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

# For QtCreator deployment
IMAGE_INSTALL:append = " rsync coreutils"

IMAGE_INSTALL:remove = " \
    packagegroup-qt6-modules \
    packagegroup-qt6-addons \
    qtdeviceutilities \
    connman \
"

IMAGE_LINGUAS = "en-us"
LICENSE = "MIT"

inherit core-image
inherit populate_sdk_qt6