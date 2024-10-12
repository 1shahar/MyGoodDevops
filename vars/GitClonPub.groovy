def call(string git_https) {
  checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: '${git_https}']])
}
