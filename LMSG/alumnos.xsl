<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Alumnos XML Transformado con XML</title>
            </head>
            <body>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Grupo</th>
                            <th>Nota</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:for-each select="alumnos/alumno">
                            <tr>
                                <td>
                                    <xsl:value-of select="Nombre"/>
                                </td>
                                <td>
                                    <xsl:value-of select="Apellido"/>
                                </td>
                                <td>
                                    <xsl:value-of select="Grupo"/>
                                </td>
                                <td>
                                    <xsl:value-of select="Nota"/>
                                </td>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>