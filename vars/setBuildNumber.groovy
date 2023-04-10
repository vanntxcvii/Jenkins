def call(int buildNumber) {
    currentBuild.displayName = "#${buildNumber}"
}
