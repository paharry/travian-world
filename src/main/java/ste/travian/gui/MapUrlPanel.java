/*
 * Copyright (C) 2008
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * "Derived from Travian world" logo. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Derived from Travian world".
 */
package ste.travian.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ste
 */
public class MapUrlPanel extends JPanel {

    private JButton mapLoadButton;
    private JLabel urlLabel;
    private JTextField urlMapText;

    public URL url;

    public MapUrlPanel() {
        urlLabel = new JLabel();
        urlMapText = new JTextField();
        mapLoadButton = new JButton();

        setLayout(new FlowLayout());
        urlLabel.setText("url:");
        add(urlLabel);

        urlMapText.setText("http://s4.travian.com/map.sql.gz");
        urlMapText.setPreferredSize(new Dimension(300, 22));
        add(urlMapText);

        mapLoadButton.setText("Load");
        mapLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapLoadButtonActionPerformed(evt);
            }
        });
        add(mapLoadButton);
    }

    // --------------------------------------------------------- Private methods

    private void mapLoadButtonActionPerformed(ActionEvent evt) {
        //
        // If no URL is provide do nothing...
        //
        String urlText = urlMapText.getText();
        if (urlText.length() == 0) {

            //
            // TODO: error!
            //
            return;
        }

        /*
        try {
            c.load(new URL(urlText));
        } catch (MalformedURLException e) {
            error("Invalid map URL: " + urlText, e);
            return;
        } catch (TravianException e) {
            error("Error loading the map from " + urlText, e);
            return;
        }
         * showMap(c.getWorldPanel());
         */
        try {
            url = new URL(urlText);
        } catch (Exception e) {
            //
            // TODO: error handling
            //
            return;
        }
    }

}
