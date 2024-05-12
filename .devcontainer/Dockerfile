FROM mcr.microsoft.com/devcontainers/base:ubuntu

# Install Java and SBT dependencies
RUN sudo apt-get update && \
    sudo apt-get install apt-transport-https curl gnupg -yqq && \
    echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list && \
    echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list && \
    curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo -H gpg --no-default-keyring --keyring gnupg-ring:/etc/apt/trusted.gpg.d/scalasbt-release.gpg --import && \
    sudo chmod 644 /etc/apt/trusted.gpg.d/scalasbt-release.gpg && \
    sudo apt-get update && \
    sudo apt install default-jdk -yqq && \
    sudo apt-get install sbt

# Install NodeJS v22.1.0
RUN sudo apt-get update && \
    sudo apt-get install -yqq curl && \
    curl -sL https://deb.nodesource.com/setup_22.x | sudo -E bash - && \
    sudo apt-get install -yqq nodejs

# Install Google Chrome
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable xvfb

# Update to latest npm
RUN sudo npm install -g npm@latest
