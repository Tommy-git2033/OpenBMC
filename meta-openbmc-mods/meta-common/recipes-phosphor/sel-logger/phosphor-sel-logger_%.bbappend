# Enable downstream autobump
SRC_URI = "git://github.com/openbmc/phosphor-sel-logger.git"
SRCREV = "151b7c1fc62971b7d319146e5ea129d44eadd9d7"

EXTRA_OECMAKE_intel += "-DREDFISH_LOG_MONITOR_PULSE_EVENTS=ON"
